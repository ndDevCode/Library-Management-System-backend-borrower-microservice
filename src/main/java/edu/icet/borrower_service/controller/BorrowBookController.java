package edu.icet.borrower_service.controller;

import edu.icet.borrower_service.dto.BorrowerDto;
import edu.icet.borrower_service.dto.ResponseDto;
import edu.icet.borrower_service.service.BorrowBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
public class BorrowBookController {

    private final BorrowBookService borrowBookService;
    @GetMapping("/borrow-list")
    public List<BorrowerDto> getAllBorrowers(){
        return borrowBookService.getBorrowers();
    }

    @PostMapping("/save-borrower")
    public ResponseEntity<ResponseDto> updateBorrower(@RequestBody BorrowerDto dto){
        if(Boolean.TRUE.equals(borrowBookService.save(dto))){
            return new ResponseEntity<>(new ResponseDto("Operation Success!",true), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseDto("Operation Unsuccessful!",false),HttpStatus.BAD_REQUEST);
    }
}
