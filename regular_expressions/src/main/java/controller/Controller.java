package controller;

import model.Model;
import model.entity.Note;
import model.entity.NoteBook;
import view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNote =
                new InputNoteNoteBook(sc, view);
        inputNote.inputNote();
        model.addNoteToBook(new Note(
                inputNote.getFirstName(),
                inputNote.getLogin(),
                inputNote.getComment(),
                inputNote.getHomePhoneNumber(),
                inputNote.getMobilePhoneNumber(),
                inputNote.getSecondMobilePhoneNumber(),
                inputNote.getEmail(),
                inputNote.getSkype(),
                inputNote.getAddress(),
                inputNote.getCreationDate()
        ));
    }
}