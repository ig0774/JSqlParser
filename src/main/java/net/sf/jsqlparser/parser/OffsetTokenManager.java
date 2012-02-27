package net.sf.jsqlparser.parser;

public class OffsetTokenManager extends CCJSqlParserTokenManager {
    public OffsetTokenManager(OffsetCharStream stream) {
        super(stream);
    }

    @Override
    protected Token jjFillToken() {
        Token t = super.jjFillToken();

        t.beginOffset = ((OffsetCharStream) input_stream).beginOffset - 1;
        t.endOffset = ((OffsetCharStream) input_stream).currentOffset;
        return t;
    }
}