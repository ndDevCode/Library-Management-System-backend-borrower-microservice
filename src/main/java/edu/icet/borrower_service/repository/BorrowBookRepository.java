package edu.icet.borrower_service.repository;

import edu.icet.borrower_service.entity.BorrowedBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowedBookEntity,Long> {
}
