import pandas as pd
import random
from datetime import datetime, timedelta

# Sample data options
bike_models = ["Honda Shine", "Yamaha FZ", "Bajaj Pulsar", "TVS Apache"]
issue_types = ["Oil Change", "Brake Issue", "Engine Issue", "Tire Problem"]
service_types = ["Maintenance", "Repair"]

# Generate data
data = []

for i in range(1, 31):  # 30 rows
    service_date = datetime(2024, 1, 1) + timedelta(days=random.randint(0, 90))
    next_service = service_date + timedelta(days=90)

    row = {
        "Customer_ID": f"C{i:03}",
        "Bike_Model": random.choice(bike_models),
        "Service_Date": service_date.strftime("%Y-%m-%d"),
        "Issue_Type": random.choice(issue_types),
        "Service_Type": random.choice(service_types),
        "Cost": random.randint(1000, 6000),
        "Mileage": random.randint(5000, 30000),
        "Next_Service_Due": next_service.strftime("%Y-%m-%d")
    }

    data.append(row)

# Create DataFrame
df = pd.DataFrame(data)

# Save as CSV
df.to_csv("bike_service_data.csv", index=False)

print("Dataset created successfully!")
print(df.head())