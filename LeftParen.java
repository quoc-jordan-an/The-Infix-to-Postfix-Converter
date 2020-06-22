package proj4;

/**
 * LEFTPAREN CLASS
 * A token that is not an operator. It is handled a certain way to convert from infix to postfix notation
 * @author Jordan An
 * @version 28/05/2020
 */
public class LeftParen implements Token{

    /** Processes the current token.  Since every token will handle
     *  itself in its own way, handling may involve pushing or
     *  popping from the given stack and/or appending more tokens
     *  to the output string.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */
    public String handle(Stack<Token> s){
        s.push(this);
        return "";
    }


    /** Returns the token as a printable String
     *
     *  @return the String version of the token.
     */
    public String toString(){
        return "(";
    }

}
