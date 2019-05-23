package perceptron;
importjava.util.Random;

class Perceptron {
    inttotalError;
    public double[] weights;
    double threshold;
    int i=0;

    public void Train(double[][] inputs, int[] outputs, double threshold, float c, int epoch)
    {
        this.threshold = threshold;
        int n = inputs[0].length;
        int p = outputs.length;
        weights = new double[n];
        Random r = new Random();
        
        //initialize weights
        for(i=0;i<n;i++)
        {
            weights[i] = r.nextDouble();
            System.out.println("WEIGHT-->"+weights[i]);
        }
       
        for(int i=0;i<epoch;i++)
        {            
            totalError = 0;
            for(int j =0;j<p;j++)
            {
                int output = Output(inputs[j]);
                int error = outputs[j] - output;
                
                totalError +=error;
               
                for(int k = 0;k<n;k++)
                {
                    double delta = c * inputs[j][k] * error;
                    weights[k] += delta;
                    
                }
            }
            if(totalError == 0)
                break;
        }
        System.out.println("TotalError::: "+totalError);
        for(int i=0;i<n;i++)
        {
            System.out.println("Final weight:"+weights[i]);
        }
    }
    
    publicint Output(double[] input)
    {
        double sum = 0.0;
        for(int i=0;i<input.length;i++)
        {
            sum += weights[i]*input[i];
        }

        if(sum>threshold)
            return 1;
        else
            return -1;
    }
}
class PerceptronTest {
    public static void main(String[] args) {
        Perceptron p = new Perceptron();
        double inputs[][] = {{-1,-1,1},{-1,1,1},{1,-1,1},{1,1,1}};
        int outputs[] = {-1,-1,-1,1};
        p.Train(inputs, outputs,0.1, (float) 1.0,100);//epoch=100;c=0.1
    }
}
