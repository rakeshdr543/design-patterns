package com.designpatterns;

import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey rakesh, kudose bro for learning design patterns");

        var editor= new Editor();
        var history=new History();

        editor.setContent("c");
        history.push(editor.createState());
        editor.setContent("c++");
        history.push(editor.createState());
        editor.setContent("java");
        history.push(editor.createState());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

//        User user = new User("Rakesh");
//        user.printName();

        // Polymorphism
//        getDraw(new CheckBox());
//        getDraw(new TextBox());

        // Inheritance
//        var textBox=new TextBox();
//        textBox.enable();
//        textBox.disable();


        // Abstraction
//        var email=new Email();
//        email.sendEmail();

        // Encapsulation
//        Account account=new Account();
//                System.out.println(account.getBalance());
//                account.deposit(120.3F);
//                account.withdraw(12F);
//                System.out.println(account.getBalance());


        //interface
//        IncomeCalculator ic=calculate();
//        System.out.println(ic.calculateIncome());
    }

    public  static void getDraw(UIControl ui){
         ui.draw();
    }
    public static IncomeCalculator2023 calculate(){
        return new IncomeCalculator2023();
    }


}
