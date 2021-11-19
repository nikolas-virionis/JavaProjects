package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Consultoria consultoria = new Consultoria("Bandtec Digital Solutions", 2);
        Desenvolvedor dev = new Desenvolvedor("nikolas", 30, 25d);
        Desenvolvedor devMobile = new DesenvolvedorMobile("diego", 40, 30d, 22, 33d);
        Desenvolvedor devSwift = new DesenvolvedorMobile("joao", 40, 20d, 10, 35d);

        consultoria.contratar(dev);
        consultoria.contratar(devMobile);
        consultoria.contratar(devSwift);
        System.out.println(consultoria.getQuantidadeDesenvolvedores());
        System.out.println(consultoria.getQuantidadeDesenvolvedoresMobile());
        System.out.println(consultoria.buscarDesenvolvedorPorNome("diego"));

    }
}
