package level2;

import java.util.*;

class Truck{
    int t, w;
    Truck(int t, int w){
        this.t=t;
        this.w=w;
    }
}

public class 다리를지나는트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        if(truck_weights.length==1) return bridge_length+1;
        
        int answer=1, curr_weight=truck_weights[0], idx=1;
        Queue<Truck> bridge=new LinkedList<>();
        bridge.offer(new Truck(1, truck_weights[0]));
        while(!bridge.isEmpty() || idx<truck_weights.length){
            int len=bridge.size();
            for(int i=0; i<len; i++){
                Truck tmp=bridge.poll();
                if(tmp.t<bridge_length) bridge.offer(new Truck(tmp.t+1, tmp.w));
                if(tmp.t==bridge_length) curr_weight-=tmp.w;
            }
            if(idx<truck_weights.length && curr_weight+truck_weights[idx]<=weight){
                curr_weight+=truck_weights[idx];
                bridge.offer(new Truck(1, truck_weights[idx++]));
            }
            answer++;
        }
        return answer;
    }
}
