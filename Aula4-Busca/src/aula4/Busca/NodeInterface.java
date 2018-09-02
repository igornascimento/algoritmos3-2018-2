/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.Busca;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
interface NodeInterface<T> {
    public boolean equals(int key);
    public Node<T> next();
}
