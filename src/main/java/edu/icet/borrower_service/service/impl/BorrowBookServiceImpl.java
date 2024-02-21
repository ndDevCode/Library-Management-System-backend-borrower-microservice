package edu.icet.borrower_service.service.impl;

import edu.icet.borrower_service.dto.BorrowerDto;
import edu.icet.borrower_service.entity.BorrowedBookEntity;
import edu.icet.borrower_service.repository.BorrowBookRepository;
import edu.icet.borrower_service.service.BorrowBookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowBookServiceImpl implements BorrowBookService {

    private final BorrowBookRepository borrowBookRepository;
    private ModelMapper mapper;
    @Bean
    private void setup(){this.mapper = new ModelMapper();}

    @Override
    public List<BorrowerDto> getBorrowers() {
        List<BorrowerDto> borrowerDtos = new ArrayList<>();
        borrowBookRepository
                .findAll()
                .forEach(borrowedBookEntity -> borrowerDtos.add(mapper.map(borrowedBookEntity, BorrowerDto.class)));
        return borrowerDtos;
    }

    @Override
    public Boolean save(BorrowerDto dto) {
        borrowBookRepository.save(mapper.map(dto, BorrowedBookEntity.class));
        return true;
    }
}
