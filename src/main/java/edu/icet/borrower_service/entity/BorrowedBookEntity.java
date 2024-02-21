package edu.icet.borrower_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "borrowed_book")
public class BorrowedBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long staffId;
    private String bookTitle;
    private String bookIsbn;
    private Long bookId;
    private LocalDateTime timestamp;
    private LocalDate returnDate;
    @Enumerated(EnumType.STRING)
    private BorrowStatus status;
}
