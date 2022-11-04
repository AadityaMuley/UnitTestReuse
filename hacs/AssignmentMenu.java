package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

abstract public class AssignmentMenu extends JDialog
{
  abstract void ShowMenu(Assignment ass,Person per);
  public AssignmentMenu()
  {
    setModal(true);
    setSize(575,330);
  }
}