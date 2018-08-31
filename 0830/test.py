import pandas as pd
df = pd.read_csv('personal_infomation.csv', header=None, skiprows=1, usecols=[3,6])
vc = df[6].value_counts()
print(vc)
