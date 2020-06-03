package Puzzle;

import java.util.Random;// biblioteca para gerar numeros aleatorios
import java.util.Arrays;


public class QuebraCabeca 
{
            private int[] matriz = new int[9];  //Cria o tabuleiro            
            private int indNull; //Armazena qual será o indice da matriz que não conterá peça
            private int movs = 0; //Numero de movimentos realizados
            ListaDePrioridade nodes; //Lista de nós que apenas foram criados/analisados
            ListaDePrioridade fechado; //Lista de nós que já foram usados pelo caminho traçado
            public int heuristica=0;
            
            
            public QuebraCabeca()
            {
                ResetaMatriz(); //Organiza a matriz no estado inicial
                
                indNull=8;
                movs = 0;
                
                              
            }
            
            
            public void setMatriz(int[] m)
            {
                matriz = m;
            }
            
            
            public void setMovs(int m)
            {
                movs = m;
            }
            
            //Função do A*. Percorre a árvore de acordo com o algoritmo e procura um nó objetivo
            //É verificado se o estado atual do nó é o correto
            //Caso não seja, irá ver se o nó visitado já existe irá realizar as operações necessárias de alteração de valores
            public No astar()
            {
                No cur = nodes.getNext();
                while(!verificaEstadoFinal(cur))
                {
                    
                    nextNodes(cur);
                    fechado.insert(cur);
                    cur = nodes.getNext();
                    
                    
                    
                }
                return cur;
                
            }
            //Cria o caminho até a solução através do ultimo nó (objetivo), percorrendo seus antecessores.
            public No[] makePath(No N)
            {
                No[] nos = new No[N.getG()];
                
                No cur = N;
                
                for(int i=N.getG()-1;i>=0;i--)
                {
                    
                    nos[i]=cur;
                    cur = cur.getPai();
                }

                return nos;
            }
            
            //calcula qual valor é a casa vazia, para poder executar o movimento de peças
            public void move(int[] stt, int p)
            {
                int blank_value = 8;//valor da peça vazia
                int blank_p = 0;
                for(int i = 0;i<9;i++)
                {
                    if(stt[i]==blank_value)
                    {
                        blank_p = i;
                        break;
                    }
                }
                

                int temp = stt[blank_p];
                stt[blank_p] = stt[p];
                stt[p] = temp;
            }   
            
            //Descobre todos os nós possíveis a partir do nó atual, calculando o custo de cada um deles e movendo.
            public void nextNodes(No N)
            {
                int blank_value = 8;
                int blank_p = 0;
                for(int i = 0;i<9;i++)
                {
                    if(N.getState()[i]==blank_value)
                    {
                        blank_p = i;
                        break;
                    }
                }
                
                switch(blank_p)
                {
                    case 0:
                    {
                        int[] temp1;//variavel temporaria que salva o estado atual da matriz
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,1);//testa o movimento
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,3);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        break;
                    }
                    case 1:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,0);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,2);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        
                        int[] temp3;
                        temp3 = Arrays.copyOf(N.getState(), 9);
                        move(temp3,4);
                        if(!N.getPai().eq(temp3) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux3 = new No(temp3,N.getG()+1,N,heuristica);
                            nodes.insert(aux3);
                        }
                        break;
                    }
                    case 2:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,1);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,5);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        break;
                    }
                    case 3:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,0);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,4);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        
                        int[] temp3;
                        temp3 = Arrays.copyOf(N.getState(), 9);
                        move(temp3,6);
                        if(!N.getPai().eq(temp3) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux3 = new No(temp3,N.getG()+1,N,heuristica);
                            nodes.insert(aux3);
                        }
                        break;
                    }
                    case 4:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,1);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,3);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        
                        int[] temp3;
                        temp3 = Arrays.copyOf(N.getState(), 9);
                        move(temp3,5);
                        if(!N.getPai().eq(temp3) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux3 = new No(temp3,N.getG()+1,N,heuristica);
                            nodes.insert(aux3);
                        }
                        
                        int[] temp4;
                        temp4 = Arrays.copyOf(N.getState(), 9);
                        move(temp4,7);
                        if(!N.getPai().eq(temp4) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux4 = new No(temp4,N.getG()+1,N,heuristica);
                            nodes.insert(aux4);
                        }
                        break;
                    }
                    case 5:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,2);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,4);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        
                        int[] temp3;
                        temp3 = Arrays.copyOf(N.getState(), 9);
                        move(temp3,8);
                        if(!N.getPai().eq(temp3) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux3 = new No(temp3,N.getG()+1,N,heuristica);
                            nodes.insert(aux3);
                        }
                        break;
                    }
                    case 6:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,3);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,7);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        break;
                    }
                    case 7:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,4);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,6);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        
                        int[] temp3;
                        temp3 = Arrays.copyOf(N.getState(), 9);
                        move(temp3,8);
                        if(!N.getPai().eq(temp3) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux3 = new No(temp3,N.getG()+1,N,heuristica);
                            nodes.insert(aux3);
                        }
                        break;
                    }
                    case 8:
                    {
                        int[] temp1;
                        temp1 = Arrays.copyOf(N.getState(), 9);
                        move(temp1,5);
                        if(!N.getPai().eq(temp1) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux1 = new No(temp1,N.getG()+1,N,heuristica);
                            nodes.insert(aux1);
                        }
                        
                        int[] temp2;
                        temp2 = Arrays.copyOf(N.getState(), 9);
                        move(temp2,7);
                        if(!N.getPai().eq(temp2) && (N.getPai().getH()-N.getH()) <= 1)
                        {
                            No aux2 = new No(temp2,N.getG()+1,N,heuristica);
                            nodes.insert(aux2);
                        }
                        break;
                    }
                    
                }
            }
            //Verifica se o nó alcançou o estado final
            public boolean verificaEstadoFinal(No N)
            {
                for(int i =0;i<9;i++)
                {
                    if(N.getState()[i]!=i)
                    {
                        return false;
                    }
                }
                return true;
            }
            
            public int getMovs() {
                return movs;
            }
            
             public int[] getMatriz() {
                return matriz;
            }
            //organiza a matriz ao estado inicial dela
            public void ResetaMatriz()
            {
                int [] temp;
                temp = Arrays.copyOf(matriz, 9);  
                nodes = new ListaDePrioridade(temp,heuristica);
                int[] a = new int[9];
                fechado = new ListaDePrioridade(a,heuristica);
                for(int i=0; i<9 ; i++)
                {
                    matriz[i]=i;
                }
                indNull=8;
                movs = 0;
            }
            
            public void ImprimeMatriz()
            {
                for(int i=0; i<9 ; i++)
                {
                    System.out.print(matriz[i]+" ");
                    if(i%3==2)
                        System.out.println("");
                }
                System.out.println("\n");
            }
            //Função que avalia quais movimentos são permitidos a partir da casa atualmente vazia
            public boolean MoveCasa(int ind)
            {
                if(!VerificaVitoria())
                {
                    movs++;
                    switch(indNull)
                    {
                        case 0: 
                            if(ind==1 || ind==3)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;
                        case 1: 
                            if(ind==0 || ind==2 || ind==4)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 2: 
                            if(ind==1 || ind==5)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 3: 
                            if(ind==0 || ind==4 || ind==6)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 4: 
                            if(ind==1 || ind==3 || ind==5 || ind==7)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 5: 
                            if(ind==2 || ind==4 || ind==8)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 6: 
                            if(ind==3 || ind==7)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 7: 
                            if(ind==4 || ind==6 || ind==8)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;

                        case 8: 
                            if(ind==5 || ind==7)
                            {
                                swap(ind,indNull);
                                return true;
                            }
                            return false;
                    }
                    movs--;
                }
                return false;
            }
            //Função para fazer a troca entre a peça e o espaço vazio(alterando também os valores da matriz base            
            public void swap(int indone, int indNullo)
            {
                int aux;
                aux=matriz[indone];
                matriz[indone]=matriz[indNullo];
                matriz[indNullo]=aux;
                indNull=indone;
                
            }
            //A partir da casa vazia, é escolhido randomicamente qual casa disponivel será mexida
            public int RamCasa()
            {
                Random r = new Random();
                int rum=r.nextInt(100);
                
                switch(indNull)
                {
                    case 0: 
                            if(rum<50)
                                return 1;
                            else
                                return 3;
                        
                    case 1: 
 
                            if(rum<33)
                                return 0;
                            else if(rum<66)
                                return 2;
                            else 
                                return 4;
                        
                    case 2: 
                  
                            if(rum<50)
                                return 1;
                            else
                                return 5;
                    
                    case 3: 
                            if(rum<33)
                                return 0;
                            else if(rum<66)
                                return 4;
                            else 
                                return 6;
                       
                    case 4: 

                            if(rum<25)
                                return 1;
                            else if(rum<50)
                                return 3;
                            else if(rum<75)
                                return 5;
                            else
                                return 7;
                    case 5: 
                            if(rum<33)
                                return 2;
                            else if(rum<66)
                                return 4;
                            else 
                                return 8;
                        
                    case 6: 
                            if(rum<50)
                                return 3;
                            else
                                return 7;
                        
                    case 7: 
                            if(rum<33)
                                return 4;
                            else if(rum<66)
                                return 6;
                            else 
                                return 8;
                        
                    case 8: 
                             if(rum<50)
                                return 5;
                            else
                                return 7;
                    
                }
                
                return -1;
            }
            //Funçao que "Bagunça" o tabuleiro atual
            public void Aleatoriza()
            {   
                int x;
                
                    x=RamCasa();
                    swap(x,indNull);
                
                movs = 0;
            }
            //Verifica se o jogador venceu
            public boolean VerificaVitoria()
            {
                for(int i=0;i<8;i++)
                    if(matriz[i]!=i)
                        return false;

                return true;
            }
            
            void setNodes(ListaDePrioridade listaDePrioridade) {
                nodes = listaDePrioridade;
            }
}
