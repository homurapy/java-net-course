package ru.daniilazarnov;

import org.checkerframework.checker.units.qual.C;

import java.io.IOException;

public class MainClient {
    public static void main (String[] args) throws IOException {
        Client client = new Client();
        client.connect();

    }
}