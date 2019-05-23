# Perceptron-Learning-Model-for-AND-gate-classificationion.
In machine learning, the perceptron is an algorithm for supervised learning of binary classifiers. It is a type of linear classifier, i.e. a classification algorithm that makes all of its predictions based on a linear predictor function combining a set of weights with the feature vector.
Major components of a perceptron:
•	Input: All the features become the input for a perceptron. We denote the input of a perceptron by [x1, x2, x3, ..,xn], where x represents the feature value and n represents the total number of features. We also have special kind of input called the bias. 
•	Weights: The values that are computed over the time of training the model. Initially, we start the value of weights with some initial value and these values get updated for each training error. We represent the weights for perceptron by [w1,w2,w3,.. wn].
•	Bias: A bias neuron allows a classifier to shift the decision boundary left or right. In algebraic terms, the bias neuron allows a classifier to translate its decision boundary. It aims to "move every point a constant distance in a specified direction." Bias helps to train the model faster and with better quality.
•	Weighted summation: Weighted summation is the sum of the values that we get after the multiplication of each weight [wn] associated with the each feature value [xn]. We represent the weighted summation by ∑wixi for all i -> [1 to n].
•	Step/activation function: The role of activation functions is to make neural networks nonlinear. For linear classification, for example, it becomes necessary to make the perceptron as linear as possible.
•	Output: The weighted summation is passed to the step/activation function and whatever value we get after computation is our predicted output.

Description:
•	Firstly, the features for an example are given as input to the perceptron.
•	These input features get multiplied by corresponding weights (starting with initial value).
•	The summation is computed for the value we get after multiplication of each feature with the corresponding weight.
•	The value of the summation is added to the bias.
•	The step/activation function is applied to the new value.
