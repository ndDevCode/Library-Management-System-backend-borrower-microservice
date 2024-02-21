package edu.icet.borrower_service.service;

import edu.icet.borrower_service.dto.BorrowerDto;

import java.util.List;

public interface BorrowBookService {
    List<BorrowerDto> getBorrowers();
    Boolean save(BorrowerDto sto);
}
