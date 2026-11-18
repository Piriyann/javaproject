import pandas as pd

df = pd.read_csv("bike_service_data.csv")

print("----- BASIC INFO -----")
print(df.info())

print("\n----- SUMMARY -----")
print(df.describe())

print("\n----- BIKE MODEL COUNT -----")
print(df["Bike_Model"].value_counts())

print("\n----- AVERAGE COST -----")
print(df["Cost"].mean())