package client;

import facade.HomeTheater;
import facade.HomeTheaterFacade;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 12:10 PM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheaterFacade();
        System.out.println("\nPreparing to watch movie...\n");

        homeTheater.watchMovie("Hello\n");

        System.out.println("Stopping..........\n");
        homeTheater.stopMovie();
    }
}