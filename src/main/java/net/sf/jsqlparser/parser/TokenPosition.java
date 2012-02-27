package net.sf.jsqlparser.parser;

public class TokenPosition {
    /** The line number of the first character of this Token. */
    public int beginLine;
    /** The column number of the first character of this Token. */
    public int beginColumn;
    /** The line number of the last character of this Token. */
    public int endLine;
    /** The column number of the last character of this Token. */
    public int endColumn;

    public int beginOffset;
    public int endOffset;

    public static TokenPosition copy(Token token) {
        TokenPosition pos = new TokenPosition();
        pos.beginLine = token.beginLine;
        pos.endLine = token.endLine;
        pos.beginColumn = token.beginColumn;
        pos.endColumn = token.endColumn;
        pos.beginOffset = token.beginOffset;
        pos.endOffset = token.endOffset;
        return pos;
    }
}
