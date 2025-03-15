
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package binario;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalisisSintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolo.class;
}

  /** Default constructor. */
  @Deprecated
  public AnalisisSintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public AnalisisSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalisisSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\006\004\007\005\005\001\002\000\004\002" +
    "\012\001\002\000\010\002\ufffc\004\ufffc\005\ufffc\001\002" +
    "\000\010\002\000\004\007\005\005\001\002\000\010\002" +
    "\ufffd\004\ufffd\005\ufffd\001\002\000\010\002\ufffe\004\ufffe" +
    "\005\ufffe\001\002\000\010\002\uffff\004\uffff\005\uffff\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\010\002\003\003\005\004\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalisisSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalisisSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalisisSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}






/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalisisSintactico$actions {


    //AQUI VA CODIGO EN JAVA

  private final AnalisisSintactico parser;

  /** Constructor */
  CUP$AnalisisSintactico$actions(AnalisisSintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalisisSintactico$do_action_part00000000(
    int                        CUP$AnalisisSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisisSintactico$parser,
    java.util.Stack            CUP$AnalisisSintactico$stack,
    int                        CUP$AnalisisSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalisisSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalisisSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= I EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalisisSintactico$parser.done_parsing();
          return CUP$AnalisisSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // I ::= S 
            {
              Integer RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.peek()).value;
		
    System.out.println(s);

              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalisisSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= S B 
            {
              Integer RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.peek()).value;
		
    RESULT = 2 * s + b;

              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("S",1, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.elementAt(CUP$AnalisisSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalisisSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // S ::= B 
            {
              Integer RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.peek()).value;
		
    RESULT = b;

              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("S",1, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalisisSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // B ::= cero 
            {
              Integer RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.peek()).value;
		 RESULT = Integer.parseInt(c); 
              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalisisSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // B ::= uno 
            {
              Integer RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).left;
		int uright = ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()).right;
		String u = (String)((java_cup.runtime.Symbol) CUP$AnalisisSintactico$stack.peek()).value;
		 RESULT = Integer.parseInt(u); 
              CUP$AnalisisSintactico$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalisisSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalisisSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalisisSintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalisisSintactico$do_action(
    int                        CUP$AnalisisSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalisisSintactico$parser,
    java.util.Stack            CUP$AnalisisSintactico$stack,
    int                        CUP$AnalisisSintactico$top)
    throws java.lang.Exception
    {
              return CUP$AnalisisSintactico$do_action_part00000000(
                               CUP$AnalisisSintactico$act_num,
                               CUP$AnalisisSintactico$parser,
                               CUP$AnalisisSintactico$stack,
                               CUP$AnalisisSintactico$top);
    }
}

}
