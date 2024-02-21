package edu.icet.borrower_service.dto;

import edu.icet.borrower_service.entity.BorrowStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerDto {
    private Long id;
    private Long userId;
    private Long staffId;
    private String bookTitle;
    private String bookIsbn;
    private Long bookId;
    private LocalDateTime timestamp;
    private LocalDate returnDate;
    private BorrowStatus status;
}
