import pandas as pd
# import numpy as np
# import random

# lst = ['robot'] * 10
# lst += ['human'] * 10
# random.shuffle(lst)
# data = pd.DataFrame({'whoAmI': lst})
# print(data)

# data['tmp'] = 1
# data.set_index([data.index, 'whoAmI'], inplace=True)
# data = data.unstack(level=-1, fill_value = 0).astype(int)
# data.columns = data.columns.droplevel()
# data.columns.name = None
# print(data)

import random
lst = ['robot'] * 10
lst += ['human'] * 10
random.shuffle(lst)
data = pd.DataFrame({'whoAmI':lst})
data.head()


un_val = data['whoAmI'].unique()
on_hot = pd.DataFrame()
for val in un_val:
    on_hot[val] = (data['whoAmI'] == val).astype(int)

on_hot.head()