package edu.icet.borrower_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDto {
    private String status;
    private Boolean isSuccess;
}
