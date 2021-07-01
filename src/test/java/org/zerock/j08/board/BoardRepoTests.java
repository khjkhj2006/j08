package org.zerock.j08.board;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.zerock.j08.board.entity.Board;
import org.zerock.j08.todo.repository.TodoRepository;
import org.zerock.j08.board.entity.Board;
import org.zerock.j08.board.respository.BoardRepositorys;

import java.util.stream.IntStream;

@ActiveProfiles("dev")
@SpringBootTest
@Log4j2
public class BoardRepoTests {

    @Autowired
    BoardRepositorys boardRepositorys;

    @Test
    public void insertDummies() {

        IntStream.rangeClosed(1,200).forEach(i -> {
            Board board = Board.builder()
                    .title("제목..")
                    .content("content....")
                    .writer("user00")
                    .build();
            boardRepositorys.save(board);

            log.info(board);
        });//end loop
    }
}
