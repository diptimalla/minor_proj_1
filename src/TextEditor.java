import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor implements ActionListener {
    //declaraing properties of texteditor
    JFrame frame;

    JMenuBar menuBar;
    JMenu file, edit;
    //file menu items
    JMenuItem newFile, openFile, saveFile;
    //edit menu items
    JMenuItem cut, copy, paste, selectAll, close;

    TextArea textArea;


    TextEditor(){
        //initialize frame
        frame = new JFrame();

        //initialize textArea
        textArea =new TextArea();

        //Initialize menubar
        menuBar =new JMenuBar();


        //initialize menus
        file = new JMenu("File");
        edit=new JMenu("Edit");


        //initialize file menu items
        newFile = new JMenuItem("New Window");
        openFile = new JMenuItem("Open File");
        saveFile = new JMenuItem("Save file");

        //adding actionlistener
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

        // add menu items to file menu
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        //initialize edit menu items
        cut= new JMenuItem("Cut");
        copy= new JMenuItem("Copy");
        paste= new JMenuItem("Paste");
        selectAll= new JMenuItem("Select All");
        close= new JMenuItem("Close");

        //adding action listener
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        copy.addActionListener(this);

        // add menu items to edit menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);



        //add menus to menubar
        menuBar.add(file);
        menuBar.add(edit);

        //SET menubar to frame
        frame.setJMenuBar(menuBar);

        frame.add(textArea);

        //set dimensions of frame
        frame.setBounds(0,0,400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource()==cut){
            //perform cut operation
            textArea.cut();

        }
        if(actionEvent.getSource()==copy){
            //perform copy operation
            textArea.copy();

        }
        if(actionEvent.getSource()==paste){
            //perform paste operation
            textArea.paste();

        }
        if(actionEvent.getSource()==selectAll){
            //perform selectAll operation
            textArea.selectAll();

        }
        if(actionEvent.getSource()==close){
            //perform close operation
            textArea.close();

        }
    }


    public static void main(String[] args) {
       TextEditor textEditor = new TextEditor();
    }
}