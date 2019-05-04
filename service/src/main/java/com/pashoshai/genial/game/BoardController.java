package com.pashoshai.genial.game;

import com.pashoshai.genial.game.data.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Validated
@Controller
@RequestMapping("/")
public class BoardController {

    private BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @RequestMapping(method = GET, path = "/boards/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Board getBoard(@PathVariable("id") UUID id) {
        // TODO
        //Board retrieved = service.get(id);
        //return applyLinks(retrieved);
        return null;
    }

    private Board applyLinks(Board board) {
        // TODO
        return board;
    }

}
