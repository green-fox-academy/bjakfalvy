import csv

with open("googleplaystore.csv", "r") as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=',')
    for line in csv_reader:
        print(line)

    csv_reader.close()

