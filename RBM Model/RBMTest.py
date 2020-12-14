from JobData import JobData
from RBMAlgorithm import RBMAlgorithm
from Evaluator import Evaluator

import random
import numpy as np

def LoadJobData():
    ml = JobData()
    print("Loading Books ratings...")
    data = ml.LoadJobData()
    print("\nComputing Books popularity ranks so we can measure novelty later...")
    rankings = ml.getPopularityRanks()
    return (ml, data, rankings)

np.random.seed(0)
random.seed(0)

# Load up common data set for the recommender algorithms
(ml, evaluationData, rankings) = LoadJobData()

# Construct an Evaluator to, you know, evaluate them
evaluator = Evaluator(evaluationData, rankings)

#Simple RBM
SimpleRBM = RBMAlgorithm(epochs=20)

evaluator.AddAlgorithm(SimpleRBM, "RBM")
# Fight!
evaluator.Evaluate(False)

evaluator.SampleTopNRecs(ml, testSubject=1)
