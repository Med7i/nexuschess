package com.nexuschess.nexuschess.model;

public class Board {
    private Piece[][] board = new Piece[8][8];

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        board[row][col] = piece;
    }
}
