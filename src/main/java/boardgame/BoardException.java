package boardgame;

import java.io.Serial;

public class BoardException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1;

    public BoardException(String msg){
        super(msg);
    }
}
