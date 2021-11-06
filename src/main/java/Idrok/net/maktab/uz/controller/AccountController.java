package Idrok.net.maktab.uz.controller;

import Idrok.net.maktab.uz.repository.UserRepository;
import Idrok.net.maktab.uz.security.JwtTokenUtil;
import Idrok.net.maktab.uz.security.Token;
import Idrok.net.maktab.uz.security.UserMaxsus;
import Idrok.net.maktab.uz.security.UserProvider;
import Idrok.net.maktab.uz.service.dto.UserDTO;
import Idrok.net.maktab.uz.service.vm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    UserProvider userProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<Token> login(@RequestBody UserMaxsus userMaxsus) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userMaxsus.getUsername(), userMaxsus.getPassword()));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        UserDetails userDetails = userProvider.loadUserByUsername(userMaxsus.getUsername());

        String token = jwtTokenUtil.generateToken(userDetails, true);

        return ResponseEntity.ok(new Token(token));

    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO) {
        if (userDTO.getId() != null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(userService.create(userDTO));
    }





}