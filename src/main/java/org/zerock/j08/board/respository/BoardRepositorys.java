package org.zerock.j08.board.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j08.board.entity.Board;

public interface BoardRepositorys extends JpaRepository<Board, Long> {
}