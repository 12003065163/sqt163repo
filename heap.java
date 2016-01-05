import java.util.arraylist;
import java.util.list;
import java.util.NoSuchElementExceptions;
import java.util.Random;
public class arraylistheap{
private list <integer> a ;
public arraylistheap(){
a=new arraylist<>();
}
private void bubbleDown(int n){
int minchildindex = minchildindex(n);
while(minchildindex != -1 && a.get(minchildindex) < a.get(n)){
swap(minchildindex,n);
n=minchildindex;
minchildindex=minchildindex(n);
}
blic boolean is heap(){
for(int i =1; i <a.siz(); ==i){
if(par(i)>=0){
if(a.get(par(i))> a.get (i)){
return false ;
}
}
}
return true ;

invate void swap(int i ,int j){
int temp=a.get(i);
a,set(i,a.get(j));
a.set(j,tmp);

verride
blic Stringto string(){
return a.toString();