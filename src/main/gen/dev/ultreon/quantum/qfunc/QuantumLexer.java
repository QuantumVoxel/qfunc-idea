// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: QuantumLexer.flex

package dev.ultreon.quantum.qfunc;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static dev.ultreon.quantum.qfunc.psi.QuantumTokenTypes.*;
import static dev.ultreon.quantum.qfunc.psi.QuantumTypes.*;


class QuantumLexer implements FlexLexer {

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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\4"+
    "\1\0\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\12\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\0\1\30\32\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\0\1\37\1\40\1\41"+
    "\1\31\1\42\1\43\1\31\1\44\1\45\1\31\1\46"+
    "\1\47\1\31\1\50\1\51\1\52\1\31\1\53\1\54"+
    "\1\55\1\56\1\31\1\57\3\31\1\60\1\61\1\62"+
    "\1\63\6\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\1\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\11\26\1\32\1\33\1\34\1\35"+
    "\1\36\1\0\1\37\1\0\1\40\1\0\1\41\1\42"+
    "\1\43\1\44\1\45\2\0\4\26\1\46\1\26\1\47"+
    "\5\26\1\17\1\50\3\26\1\51\10\26\1\52\1\26"+
    "\1\53\2\26\1\54\1\26\1\55\1\26\1\56\2\26"+
    "\1\57\4\26\1\60\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[99];
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
    "\0\0\0\64\0\150\0\234\0\64\0\64\0\64\0\64"+
    "\0\320\0\64\0\64\0\64\0\64\0\64\0\64\0\u0104"+
    "\0\u0138\0\64\0\64\0\u016c\0\u01a0\0\u01d4\0\64\0\u0208"+
    "\0\64\0\64\0\64\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\64\0\64\0\64\0\64"+
    "\0\64\0\320\0\64\0\u0410\0\u0444\0\u0478\0\64\0\64"+
    "\0\64\0\64\0\64\0\u0208\0\u04ac\0\u04e0\0\u0514\0\u0548"+
    "\0\u057c\0\u0208\0\u05b0\0\u0208\0\u05e4\0\u0618\0\u064c\0\u0680"+
    "\0\u06b4\0\u0478\0\u04ac\0\u06e8\0\u071c\0\u0750\0\u0208\0\u0784"+
    "\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0208"+
    "\0\u0924\0\u0208\0\u0958\0\u098c\0\u0208\0\u09c0\0\u0208\0\u09f4"+
    "\0\u0208\0\u0a28\0\u0a5c\0\u0208\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c"+
    "\0\u0208\0\u0208\0\u0208";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[99];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\2\1\32\1\33\2\30\1\34\1\35"+
    "\1\36\1\37\1\30\1\40\1\30\1\41\2\30\1\42"+
    "\1\30\1\43\2\30\1\44\1\45\1\46\1\47\1\50"+
    "\65\0\2\3\107\0\1\51\35\0\2\52\1\0\6\52"+
    "\1\53\21\52\1\54\30\52\21\0\1\55\62\0\1\56"+
    "\1\0\1\21\66\0\1\57\1\60\63\0\1\61\63\0"+
    "\1\62\1\63\53\0\1\64\2\65\1\30\6\0\1\30"+
    "\4\0\1\64\21\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\14\30\1\66\4\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\12\30\1\67"+
    "\6\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\10\30\1\70\10\30\23\0\1\64\2\65\1\30"+
    "\6\0\1\30\4\0\1\64\12\30\1\71\6\30\23\0"+
    "\1\64\2\65\1\30\6\0\1\30\4\0\1\64\4\30"+
    "\1\72\4\30\1\73\3\30\1\74\3\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\12\30\1\75"+
    "\6\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\3\30\1\76\10\30\1\77\4\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\16\30\1\100"+
    "\2\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\5\30\1\101\13\30\4\0\2\52\2\0\60\52"+
    "\2\55\1\0\61\55\22\0\1\102\60\0\3\65\1\103"+
    "\6\0\1\103\4\0\1\65\21\103\23\0\1\64\2\65"+
    "\1\30\6\0\1\30\4\0\1\64\3\30\1\104\15\30"+
    "\23\0\1\64\2\65\1\30\6\0\1\30\4\0\1\64"+
    "\11\30\1\105\7\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\15\30\1\106\3\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\14\30\1\107"+
    "\4\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\13\30\1\110\5\30\23\0\1\64\2\65\1\30"+
    "\6\0\1\30\4\0\1\64\12\30\1\111\6\30\23\0"+
    "\1\64\2\65\1\30\6\0\1\30\4\0\1\64\14\30"+
    "\1\112\4\30\23\0\1\64\2\65\1\30\6\0\1\30"+
    "\4\0\1\64\3\30\1\113\15\30\23\0\1\64\2\65"+
    "\1\30\6\0\1\30\4\0\1\64\12\30\1\114\6\30"+
    "\23\0\1\64\2\65\1\30\6\0\1\30\4\0\1\64"+
    "\6\30\1\115\12\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\1\116\20\30\23\0\1\64\2\65"+
    "\1\30\6\0\1\30\4\0\1\64\16\30\1\117\2\30"+
    "\23\0\1\64\2\65\1\30\6\0\1\30\4\0\1\64"+
    "\3\30\1\120\15\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\17\30\1\121\1\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\13\30\1\122"+
    "\5\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\15\30\1\123\3\30\23\0\1\64\2\65\1\30"+
    "\6\0\1\30\4\0\1\64\15\30\1\124\3\30\23\0"+
    "\1\64\2\65\1\30\6\0\1\30\4\0\1\64\13\30"+
    "\1\125\5\30\23\0\1\64\2\65\1\30\6\0\1\30"+
    "\4\0\1\64\10\30\1\126\10\30\23\0\1\64\2\65"+
    "\1\30\6\0\1\30\4\0\1\64\7\30\1\127\11\30"+
    "\23\0\1\64\2\65\1\30\6\0\1\30\4\0\1\64"+
    "\6\30\1\130\12\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\16\30\1\131\2\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\6\30\1\132"+
    "\12\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\3\30\1\133\15\30\23\0\1\64\2\65\1\30"+
    "\6\0\1\30\4\0\1\64\3\30\1\134\15\30\23\0"+
    "\1\64\2\65\1\30\6\0\1\30\4\0\1\64\11\30"+
    "\1\135\7\30\23\0\1\64\2\65\1\30\6\0\1\30"+
    "\4\0\1\64\15\30\1\136\3\30\23\0\1\64\2\65"+
    "\1\30\6\0\1\30\4\0\1\64\11\30\1\137\7\30"+
    "\23\0\1\64\2\65\1\30\6\0\1\30\4\0\1\64"+
    "\17\30\1\140\1\30\23\0\1\64\2\65\1\30\6\0"+
    "\1\30\4\0\1\64\16\30\1\141\2\30\23\0\1\64"+
    "\2\65\1\30\6\0\1\30\4\0\1\64\16\30\1\142"+
    "\2\30\23\0\1\64\2\65\1\30\6\0\1\30\4\0"+
    "\1\64\3\30\1\143\15\30\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2912];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\4\11\1\1\6\11\2\1\2\11"+
    "\3\1\1\11\1\1\3\11\11\1\5\11\1\0\1\11"+
    "\1\0\1\1\1\0\5\11\2\0\56\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[99];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  QuantumLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          // fall through
          case 51: break;
          case 2:
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          // fall through
          case 52: break;
          case 3:
            { return NOT;
            }
          // fall through
          case 53: break;
          case 4:
            { return HASH;
            }
          // fall through
          case 54: break;
          case 5:
            { return DOLLAR;
            }
          // fall through
          case 55: break;
          case 6:
            { return PERCENT;
            }
          // fall through
          case 56: break;
          case 7:
            { return BITWISE_AND;
            }
          // fall through
          case 57: break;
          case 8:
            { return LPAREN;
            }
          // fall through
          case 58: break;
          case 9:
            { return RPAREN;
            }
          // fall through
          case 59: break;
          case 10:
            { return STAR;
            }
          // fall through
          case 60: break;
          case 11:
            { return PLUS;
            }
          // fall through
          case 61: break;
          case 12:
            { return COMMA;
            }
          // fall through
          case 62: break;
          case 13:
            { return MINUS;
            }
          // fall through
          case 63: break;
          case 14:
            { return SLASH;
            }
          // fall through
          case 64: break;
          case 15:
            { return FLOATING_POINT;
            }
          // fall through
          case 65: break;
          case 16:
            { return COLON;
            }
          // fall through
          case 66: break;
          case 17:
            { return SEMICOLON;
            }
          // fall through
          case 67: break;
          case 18:
            { return LESS_THAN;
            }
          // fall through
          case 68: break;
          case 19:
            { return ASSIGN;
            }
          // fall through
          case 69: break;
          case 20:
            { return GREATER_THAN;
            }
          // fall through
          case 70: break;
          case 21:
            { return AT;
            }
          // fall through
          case 71: break;
          case 22:
            { return IDENTIFIER;
            }
          // fall through
          case 72: break;
          case 23:
            { return LBRACKET;
            }
          // fall through
          case 73: break;
          case 24:
            { return RBRACKET;
            }
          // fall through
          case 74: break;
          case 25:
            { return BITWISE_XOR;
            }
          // fall through
          case 75: break;
          case 26:
            { return LBRACE;
            }
          // fall through
          case 76: break;
          case 27:
            { return BITWISE_OR;
            }
          // fall through
          case 77: break;
          case 28:
            { return RBRACE;
            }
          // fall through
          case 78: break;
          case 29:
            { return BITWISE_NOT;
            }
          // fall through
          case 79: break;
          case 30:
            { return NOT_EQUAL;
            }
          // fall through
          case 80: break;
          case 31:
            { return STRING;
            }
          // fall through
          case 81: break;
          case 32:
            { return COMMENT;
            }
          // fall through
          case 82: break;
          case 33:
            { return SHIFT_LEFT;
            }
          // fall through
          case 83: break;
          case 34:
            { return LESS_THAN_EQUAL;
            }
          // fall through
          case 84: break;
          case 35:
            { return EQUAL;
            }
          // fall through
          case 85: break;
          case 36:
            { return GREATER_THAN_EQUAL;
            }
          // fall through
          case 86: break;
          case 37:
            { return SHIFT_RIGHT;
            }
          // fall through
          case 87: break;
          case 38:
            { return IF;
            }
          // fall through
          case 88: break;
          case 39:
            { return IS;
            }
          // fall through
          case 89: break;
          case 40:
            { return PATH;
            }
          // fall through
          case 90: break;
          case 41:
            { return FOR;
            }
          // fall through
          case 91: break;
          case 42:
            { return ELSE;
            }
          // fall through
          case 92: break;
          case 43:
            { return LOOP;
            }
          // fall through
          case 93: break;
          case 44:
            { return STOP;
            }
          // fall through
          case 94: break;
          case 45:
            { return BREAK;
            }
          // fall through
          case 95: break;
          case 46:
            { return INPUT;
            }
          // fall through
          case 96: break;
          case 47:
            { return WHILE;
            }
          // fall through
          case 97: break;
          case 48:
            { return PERSIST;
            }
          // fall through
          case 98: break;
          case 49:
            { return PRESENT;
            }
          // fall through
          case 99: break;
          case 50:
            { return CONTINUE;
            }
          // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
