    package Idrok.net.maktab.uz.controller;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import org.springframework.web.multipart.MultipartFile;

    import java.io.IOException;

    @CrossOrigin
    @RestController
    @RequestMapping("images")
    public class ImageController {

    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam("file")MultipartFile file){

     if (file.isEmpty()){
        throw new RuntimeException("fayl topilmadi");
     }

        return new ResponseEntity<>(HttpStatus.OK);
    }




   }
