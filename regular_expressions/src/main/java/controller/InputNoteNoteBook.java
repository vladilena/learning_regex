package controller;

import view.View;

import java.util.ArrayList;
import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.TextConstant.*;


public class InputNoteNoteBook {
    private Scanner sc;
    private View view;

    private String firstName;
    private String login;
    private String comment;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private String email;
    private String skype;
//    private ArrayList<String> adress;

    public InputNoteNoteBook(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    void inputNote() {
        UtilityController contr = new UtilityController(sc, view);
        String str = ((String.valueOf(view.bundle.getLocale()).equals("ua")))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.firstName =
                contr.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                contr.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);

        this.comment = contr.inputStringValueWithScanner(COMMENT_DATA, REGEX_COMMENT);
        this.homePhoneNumber = contr.inputStringValueWithScanner(HOME_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.mobilePhoneNumber = contr.inputStringValueWithScanner(MOBILE_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.secondMobilePhoneNumber = contr.inputStringValueWithScanner(SECOND_MOBILE_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.email = contr.inputStringValueWithScanner(EMAIL_DATA, REGEX_EMAIL);
        this.skype = contr.inputStringValueWithScanner(SKYPE_DATA, REGEX_SKYPE);

    }

    public Scanner getSc() {
        return sc;
    }

    public View getView() {
        return view;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public String getComment() {
        return comment;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }
}
