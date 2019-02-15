package controller;

import model.Model;
import model.entity.Note;
import model.entity.NoteBook;
import view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    private NoteBook noteBook;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(sc, view);
        inputNoteNoteBook.inputNote();
        model.addNoteToBook(new Note(inputNoteNoteBook.getFirstName(), inputNoteNoteBook.getLogin(), inputNoteNoteBook.getComment(), inputNoteNoteBook.getHomePhoneNumber(), inputNoteNoteBook.getMobilePhoneNumber(), inputNoteNoteBook.getSecondMobilePhoneNumber(), inputNoteNoteBook.getEmail(), inputNoteNoteBook.getSkype()));
    }
}