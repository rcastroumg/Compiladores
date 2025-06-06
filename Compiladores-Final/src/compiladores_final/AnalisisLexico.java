/* The following code was generated by JFlex 1.7.0 */

package compiladores_final;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import compiladores_final.Interfaz;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>lexico.jflex</tt>
 */
public class AnalisisLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\25\1\26\1\72\1\25\1\25\22\0\1\25\1\54\1\66"+
    "\1\71\1\0\1\65\1\46\1\67\1\37\1\40\1\62\1\60\1\43"+
    "\1\61\1\2\1\63\12\1\1\44\1\45\1\56\1\55\1\57\1\47"+
    "\1\0\1\15\1\16\1\51\1\22\1\21\1\24\1\11\1\14\1\4"+
    "\2\3\1\20\1\3\1\5\1\17\2\3\1\10\1\7\1\6\1\23"+
    "\1\52\1\50\3\3\1\0\1\70\1\0\1\64\1\3\1\0\1\34"+
    "\1\16\1\12\1\22\1\32\1\33\1\11\1\13\1\4\2\3\1\35"+
    "\1\3\1\5\1\17\2\3\1\30\1\36\1\27\1\31\1\52\1\50"+
    "\3\3\1\41\1\53\1\42\7\0\1\72\u1fa2\0\1\72\1\72\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\12\3\1\4\2\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\3"+
    "\1\1\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\2\1\1\4\1\0\1\3\1\30"+
    "\13\3\1\31\2\3\1\32\1\33\2\0\1\34\1\0"+
    "\1\35\1\36\7\3\1\37\5\3\1\0\1\40\4\3"+
    "\1\41\1\3\1\42\1\3\1\43\1\4\2\3\1\44"+
    "\2\3\1\45\1\46\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\u0162\0\u019d"+
    "\0\u01d8\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff\0\u033a\0\u0375"+
    "\0\73\0\73\0\73\0\73\0\73\0\73\0\73\0\u03b0"+
    "\0\73\0\u03eb\0\u0426\0\u0461\0\u049c\0\73\0\u04d7\0\73"+
    "\0\73\0\73\0\73\0\73\0\u0512\0\73\0\73\0\u054d"+
    "\0\u0588\0\u05c3\0\u05fe\0\u0639\0\261\0\u0674\0\u06af\0\u06ea"+
    "\0\u0725\0\u0760\0\u079b\0\u07d6\0\u0811\0\u084c\0\u0887\0\u08c2"+
    "\0\73\0\u08fd\0\u0938\0\73\0\73\0\u0973\0\u054d\0\73"+
    "\0\u09ae\0\u05fe\0\261\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\u0ad5"+
    "\0\u0b10\0\u0b4b\0\261\0\u0b86\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72"+
    "\0\u0cad\0\73\0\u0ce8\0\u0d23\0\u0d5e\0\u0d99\0\261\0\u0dd4"+
    "\0\261\0\u0e0f\0\261\0\73\0\u0e4a\0\u0e85\0\261\0\u0ec0"+
    "\0\u0efb\0\261\0\261\0\u0f36";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\2\4\1\6\1\7"+
    "\1\4\1\10\1\4\1\11\1\4\1\12\2\4\1\13"+
    "\1\14\1\4\1\15\2\16\1\17\1\7\1\4\1\13"+
    "\1\20\2\4\1\6\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\2\1\52\75\0\1\3"+
    "\1\53\71\0\1\4\1\0\22\4\2\0\10\4\11\0"+
    "\3\4\21\0\1\4\1\0\2\4\1\54\16\4\1\55"+
    "\2\0\4\4\1\55\3\4\11\0\3\4\21\0\1\4"+
    "\1\0\3\4\1\56\16\4\2\0\1\56\7\4\11\0"+
    "\3\4\21\0\1\4\1\0\16\4\1\57\3\4\2\0"+
    "\3\4\1\57\4\4\11\0\3\4\21\0\1\4\1\0"+
    "\10\4\2\60\3\4\1\61\4\4\2\0\6\4\1\61"+
    "\1\4\11\0\3\4\21\0\1\4\1\0\10\4\2\60"+
    "\10\4\2\0\10\4\11\0\3\4\21\0\1\4\1\0"+
    "\14\4\1\62\5\4\2\0\10\4\11\0\3\4\21\0"+
    "\1\4\1\0\15\4\1\63\4\4\2\0\6\4\1\63"+
    "\1\4\11\0\3\4\21\0\1\4\1\0\14\4\1\64"+
    "\5\4\2\0\10\4\11\0\3\4\21\0\1\4\1\0"+
    "\14\4\1\65\1\66\4\4\2\0\6\4\1\66\1\4"+
    "\11\0\3\4\45\0\2\16\45\0\1\4\1\0\22\4"+
    "\2\0\1\4\1\67\6\4\11\0\3\4\21\0\1\4"+
    "\1\0\14\4\1\65\1\66\4\4\2\0\5\4\1\70"+
    "\1\66\1\4\11\0\3\4\66\0\1\71\25\0\1\4"+
    "\1\0\10\4\2\72\10\4\2\0\10\4\11\0\3\4"+
    "\21\0\1\4\1\0\15\4\1\61\4\4\2\0\6\4"+
    "\1\61\1\4\11\0\3\4\21\0\1\4\1\0\14\4"+
    "\1\73\5\4\2\0\10\4\11\0\3\4\73\0\1\74"+
    "\74\0\1\75\77\0\1\76\10\0\66\77\1\100\4\77"+
    "\67\101\2\0\2\101\26\52\1\0\44\52\1\0\1\102"+
    "\72\0\1\4\1\0\3\4\1\103\16\4\2\0\1\103"+
    "\7\4\11\0\3\4\21\0\1\4\1\0\5\4\1\104"+
    "\14\4\2\0\1\4\1\104\6\4\11\0\3\4\21\0"+
    "\1\4\1\0\3\4\1\105\16\4\2\0\1\105\7\4"+
    "\11\0\3\4\21\0\1\4\1\0\12\4\1\106\7\4"+
    "\2\0\5\4\1\106\2\4\11\0\3\4\21\0\1\4"+
    "\1\0\12\4\1\107\7\4\2\0\5\4\1\107\2\4"+
    "\11\0\3\4\21\0\1\4\1\0\14\4\1\110\5\4"+
    "\2\0\10\4\11\0\3\4\21\0\1\4\1\0\4\4"+
    "\1\111\15\4\2\0\7\4\1\111\11\0\3\4\21\0"+
    "\1\4\1\0\20\4\1\112\1\4\2\0\2\4\1\112"+
    "\5\4\11\0\3\4\21\0\1\4\1\0\5\4\1\113"+
    "\14\4\2\0\1\4\1\113\6\4\11\0\3\4\21\0"+
    "\1\4\1\0\14\4\1\114\5\4\2\0\10\4\11\0"+
    "\3\4\21\0\1\4\1\0\22\4\2\0\2\4\1\115"+
    "\5\4\11\0\3\4\21\0\1\4\1\0\22\4\2\0"+
    "\6\4\1\116\1\4\11\0\3\4\21\0\1\4\1\0"+
    "\1\4\1\117\20\4\2\0\10\4\11\0\3\4\21\0"+
    "\1\4\1\0\1\4\1\120\20\4\2\0\10\4\11\0"+
    "\3\4\20\0\62\76\1\121\10\76\67\0\1\122\4\0"+
    "\1\4\1\0\1\4\1\123\20\4\2\0\10\4\11\0"+
    "\3\4\21\0\1\4\1\0\20\4\1\124\1\4\2\0"+
    "\2\4\1\124\5\4\11\0\3\4\21\0\1\4\1\0"+
    "\5\4\1\103\14\4\2\0\1\4\1\103\6\4\11\0"+
    "\3\4\21\0\1\4\1\0\4\4\1\125\15\4\2\0"+
    "\7\4\1\125\11\0\3\4\21\0\1\4\1\0\15\4"+
    "\1\126\4\4\2\0\6\4\1\126\1\4\11\0\3\4"+
    "\21\0\1\4\1\0\16\4\1\127\3\4\2\0\3\4"+
    "\1\127\4\4\11\0\3\4\21\0\1\4\1\0\13\4"+
    "\1\130\6\4\2\0\10\4\11\0\3\4\21\0\1\4"+
    "\1\0\12\4\1\54\7\4\2\0\5\4\1\54\2\4"+
    "\11\0\3\4\21\0\1\4\1\0\22\4\2\0\3\4"+
    "\1\131\4\4\11\0\3\4\21\0\1\4\1\0\22\4"+
    "\2\0\7\4\1\115\11\0\3\4\21\0\1\4\1\0"+
    "\15\4\1\132\4\4\2\0\6\4\1\132\1\4\11\0"+
    "\3\4\21\0\1\4\1\0\17\4\1\133\2\4\2\0"+
    "\10\4\11\0\3\4\20\0\62\76\1\121\1\134\7\76"+
    "\1\0\1\4\1\0\2\4\1\135\17\4\2\0\10\4"+
    "\11\0\3\4\21\0\1\4\1\0\5\4\1\136\14\4"+
    "\2\0\1\4\1\136\6\4\11\0\3\4\21\0\1\4"+
    "\1\0\16\4\1\137\3\4\2\0\3\4\1\137\4\4"+
    "\11\0\3\4\21\0\1\4\1\0\16\4\1\140\3\4"+
    "\2\0\3\4\1\140\4\4\11\0\3\4\21\0\1\4"+
    "\1\0\15\4\1\141\4\4\2\0\6\4\1\141\1\4"+
    "\11\0\3\4\21\0\1\4\1\0\16\4\1\142\3\4"+
    "\2\0\3\4\1\142\4\4\11\0\3\4\21\0\1\4"+
    "\1\0\6\4\1\103\13\4\2\0\10\4\11\0\3\4"+
    "\21\0\1\4\1\0\2\4\1\143\17\4\2\0\10\4"+
    "\11\0\3\4\21\0\1\4\1\0\12\4\1\144\7\4"+
    "\2\0\5\4\1\144\2\4\11\0\3\4\21\0\1\4"+
    "\1\0\16\4\1\103\3\4\2\0\3\4\1\103\4\4"+
    "\11\0\3\4\21\0\1\4\1\0\2\4\1\103\17\4"+
    "\2\0\10\4\11\0\3\4\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3953];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\16\1\7\11\1\1\1\11\4\1\1\11"+
    "\1\1\5\11\1\1\2\11\3\1\1\0\15\1\1\11"+
    "\2\1\2\11\2\0\1\11\1\0\17\1\1\0\1\11"+
    "\11\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
//variables, metodos y funciones que necesite (codigo java)

  ComplexSymbolFactory symbolFactory;
  
  public void setSymbolFactory(ComplexSymbolFactory sf){
      symbolFactory = sf;
  }

  private Symbol symbol(String name, int sym) {
      return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+yylength(),yychar+yylength()));
  }

  private Symbol symbol(String name, int sym, Object val) {
      Location left = new Location(yyline+1,yycolumn+1,yychar);
      Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
      return symbolFactory.newSymbol(name, sym, left, right,val);
  }
  private Symbol symbol(String name, int sym, Object val,int buflength) {
      Location left = new Location(yyline+1,yycolumn+yylength()-buflength,yychar+yylength()-buflength);
      Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
      return symbolFactory.newSymbol(name, sym, left, right,val);
  }
  private void error(String message) {
    System.out.println("Error lexico en linea "+(yyline+1)+", columna "+(yycolumn+1)+" caracter: "+message);
    String errLex = "Error lexico en linea "+(yyline+1)+", columna "+(yycolumn+1)+" caracter: "+message;
    Interfaz.notificar_err(errLex);
  }




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalisisLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 212) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {      return symbolFactory.newSymbol("EOF", Simbolo.EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { error(yytext());
            } 
            // fall through
          case 39: break;
          case 2: 
            { return symbol("ENTERO",Simbolo.ENTERO, yytext());
            } 
            // fall through
          case 40: break;
          case 3: 
            { return symbol("ID",Simbolo.ID, yytext());
            } 
            // fall through
          case 41: break;
          case 4: 
            { 
            } 
            // fall through
          case 42: break;
          case 5: 
            { return symbol("PARENTESIS_ABIERTO",Simbolo.PARENTESIS_ABIERTO);
            } 
            // fall through
          case 43: break;
          case 6: 
            { return symbol("PARENTESIS_CERRADO",Simbolo.PARENTESIS_CERRADO);
            } 
            // fall through
          case 44: break;
          case 7: 
            { return symbol("LLAVE_ABIERTO",Simbolo.LLAVE_ABIERTO);
            } 
            // fall through
          case 45: break;
          case 8: 
            { return symbol("LLAVE_CERRADO",Simbolo.LLAVE_CERRADO);
            } 
            // fall through
          case 46: break;
          case 9: 
            { return symbol("COMA",Simbolo.COMA);
            } 
            // fall through
          case 47: break;
          case 10: 
            { return symbol("DOS_PUNTOS",Simbolo.DOS_PUNTOS);
            } 
            // fall through
          case 48: break;
          case 11: 
            { return symbol("PUNTO_COMA",Simbolo.PUNTO_COMA,yytext());
            } 
            // fall through
          case 49: break;
          case 12: 
            { return symbol("AMPERSAND",Simbolo.AMPERSAND);
            } 
            // fall through
          case 50: break;
          case 13: 
            { return symbol("TERNARIO",Simbolo.TERNARIO);
            } 
            // fall through
          case 51: break;
          case 14: 
            { return symbol("NOT",Simbolo.NOT);
            } 
            // fall through
          case 52: break;
          case 15: 
            { return symbol("IGUAL",Simbolo.IGUAL);
            } 
            // fall through
          case 53: break;
          case 16: 
            { return symbol("MENOR",Simbolo.MENOR);
            } 
            // fall through
          case 54: break;
          case 17: 
            { return symbol("MAYOR",Simbolo.MAYOR);
            } 
            // fall through
          case 55: break;
          case 18: 
            { return symbol("MAS",Simbolo.MAS);
            } 
            // fall through
          case 56: break;
          case 19: 
            { return symbol("MENOS",Simbolo.MENOS);
            } 
            // fall through
          case 57: break;
          case 20: 
            { return symbol("ASTERISCO",Simbolo.ASTERISCO);
            } 
            // fall through
          case 58: break;
          case 21: 
            { return symbol("SLASH",Simbolo.SLASH);
            } 
            // fall through
          case 59: break;
          case 22: 
            { return symbol("POTENCIA",Simbolo.POTENCIA);
            } 
            // fall through
          case 60: break;
          case 23: 
            { return symbol("MODULO",Simbolo.MODULO);
            } 
            // fall through
          case 61: break;
          case 24: 
            { return symbol("IF",Simbolo.IF);
            } 
            // fall through
          case 62: break;
          case 25: 
            { return symbol("AND",Simbolo.AND);
            } 
            // fall through
          case 63: break;
          case 26: 
            { return symbol("OR",Simbolo.OR);
            } 
            // fall through
          case 64: break;
          case 27: 
            { return symbol("IGUAL_IGUAL",Simbolo.IGUAL_IGUAL);
            } 
            // fall through
          case 65: break;
          case 28: 
            { String t = yytext();
                return symbol("CADENA",Simbolo.CADENA, t.substring(1, t.length() - 1));
            } 
            // fall through
          case 66: break;
          case 29: 
            { return symbol("DOUBLE",Simbolo.DOUBLE, yytext());
            } 
            // fall through
          case 67: break;
          case 30: 
            { return symbol("TIPO",Simbolo.TIPO,yytext());
            } 
            // fall through
          case 68: break;
          case 31: 
            { return symbol("FOR",Simbolo.FOR);
            } 
            // fall through
          case 69: break;
          case 32: 
            { String t = yytext();
                return symbol("CARACTER",Simbolo.CARACTER, t.substring(1, t.length() - 1));
            } 
            // fall through
          case 70: break;
          case 33: 
            { return symbol("ELSE",Simbolo.ELSE);
            } 
            // fall through
          case 71: break;
          case 34: 
            { return symbol("BOOLEANO",Simbolo.BOOLEANO, yytext());
            } 
            // fall through
          case 72: break;
          case 35: 
            { return symbol("VOID",Simbolo.VOID);
            } 
            // fall through
          case 73: break;
          case 36: 
            { return symbol("CLASE",Simbolo.CLASE);
            } 
            // fall through
          case 74: break;
          case 37: 
            { return symbol("WHILE",Simbolo.WHILE);
            } 
            // fall through
          case 75: break;
          case 38: 
            { return symbol("RETURN",Simbolo.RETURN);
            } 
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
