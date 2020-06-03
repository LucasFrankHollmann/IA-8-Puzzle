package Puzzle;

import java.util.ArrayList;


public class ListaDePrioridade {
    private ArrayList<No> T = new ArrayList<>();
    
    
    public ListaDePrioridade(int[] st, int h)
    {
        No pai = new No(st,0,null,h);
        T.add(new No(st,0,pai,h));
    }
    
    //Calcula qual nó é o melhor caminho para se seguir
    public No getNext()
    {
        No temp = null;
        int menor = 9999999;
        for(int i = 0;i<T.size();i++)
        {
            if(T.get(i).getF()<menor)
            {
                menor = T.get(i).getF();
                temp = T.get(i);
            }
        }
        T.remove(temp);
        return temp;
    }
    
    public void insert(No node)
    {
        T.add(node);
    }
    
    public boolean isEmpty()
    {
        return T.isEmpty();
    }
}
