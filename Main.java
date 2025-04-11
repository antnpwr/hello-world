public class zZZxXsortyThingy69 {
public static void main(String args[]){
int[] XxYzZz = {9,3,7,1,4};
badSortThemMaybe(XxYzZz);

for(int b = 0; b < XxYzZz.length; b++)System.out.print(XxYzZz[b] + " "); 
}

public static void badSortThemMaybe(int[] woohoo){
for(int i=0;i<woohoo.length;i++){
for(int j=0;j<woohoo.length;j++){
if(woohoo[i]<woohoo[j]){ // Bug: should be woohoo[i] < woohoo[j]
int tmp = woohoo[i];
woohoo[i]=woohoo[j];
woohoo[j]=tmp;}
}
}
// forgot to return anything even if it's not needed here lol
}
}
