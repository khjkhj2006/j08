package org.zerock.j08.board.respository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j08.board.entity.Board;
import org.zerock.j08.board.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply,Long> {

    Page<Reply> getByBoard(Board board, Pageable pageable);
}