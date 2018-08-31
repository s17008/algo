import csv
count = {}
with open('personal_infomation.csv', newline='') as f:
    reader = csv.reader(f)
    header = next(reader)
    for c in reader:
        home = c[6]
        count.setdefault(home, 0)
        count[home] += 1
for key, value in count.items():
    print("{}:{}".format(key,value))
