package Puzzle;

import static java.lang.Math.abs;

//cria o nó para armazenar o estado atual da matriz
public final class No {
    private int[] state = new int[9];//matriz de valores do tabuleiro
    int g;//profundidade do nó na arvore, definindo quantos passos foram realizados 
    int h;//valor resultante da heurística utilizada 
    int f;//soma de g e h
    No pai;

    
   
    
    public No(int[] st, int g, No p, int heuristica)
    {
        state = st;
        this.g = g;
        pai = p;
        
        switch(heuristica)
        {
            //Consiste na soma de passos necessários que cada peça precisa dar para chegar ao local correto
            case 0:
                Manhattan();
                break;
            
            //Analisa se a peça esta fora ou não do local, caso esteja, soma mais um    
            case 1:
                Hamming();
                break;
        }
        
    }


    //Analisa se o nó encontrado é igual ao nó atual
    public boolean eq(int[] m)
    {
        for(int i=0;i<9;i++)
        {
            if(m[i]!=state[i])
            {
                return false;
            }
        }
        return true;
    }
    
    public No getPai() {
        return pai;
    }
    
    public int[] getState() {
        return state;
    }
    
    public void Hamming() //calcula o h-value (custo heuristico) com base nas posições que não estão na posição final.
    {
        h = 0;
        for(int i = 0;i<9;i++)
        {
            if(state[i]!=i && state[i]!=8)
            {
                h++;
            }
        }
        
        f = g+h;
    }
    
    public void Manhattan() //calcula o h-value (custo heuristico) com base nas distancias entre a casa atual e seu objetivo final.
    {
        h = 0;
        
        int[][] mat;
        mat = new int[3][3];
        
        int k = 0;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=state[k++];
            }
        }
        
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                switch(mat[i][j])
                {
                    case 0:
                        h+=abs(0-i)+abs(0-j);
                        break;
                    case 1:
                        h+=abs(0-i)+abs(1-j);
                        break;
                    case 2:
                        h+=abs(0-i)+abs(2-j);
                        break;
                    case 3:
                        h+=abs(1-i)+abs(0-j);
                        break;
                    case 4:
                        h+=abs(1-i)+abs(1-j);
                        break;    
                    case 5:
                        h+=abs(1-i)+abs(2-j);
                        break;
                    case 6:
                        h+=abs(2-i)+abs(0-j);
                        break;
                    case 7:
                        h+=abs(2-i)+abs(1-j);
                        break;
                    case 8:
                        h+=abs(2-i)+abs(2-j);
                        break;
                }
            }
        }
        h/=2;
        
        
        f = g+h;
    }
    
     public int getG() {
        return g;
    }

    public int getH() {
        return h;
    }

    public int getF() {
        return f;
    }
    
   
}
