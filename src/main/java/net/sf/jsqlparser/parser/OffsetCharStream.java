package net.sf.jsqlparser.parser;

import java.io.IOException;
import java.io.Reader;

public class OffsetCharStream extends SimpleCharStream {
    public int beginOffset;
    public int currentOffset;

    public OffsetCharStream(Reader r) {
        super(r);
    }

    public OffsetCharStream(Reader r, int startLine, int startColumn) {
        super(r, 1, 1);
    }

    @Override
    public char BeginToken() throws IOException {
        char c = super.BeginToken();
        beginOffset = currentOffset;
        return c;
    }

    @Override
    public char readChar() throws IOException {
        char c = super.readChar();
        currentOffset++;
        return c;
    }

    @Override
    public void backup(int amount) {
        super.backup(amount);
        currentOffset -= amount;
    }
}