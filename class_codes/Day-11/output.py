import tensorflow as tf
from tensorflow.keras.preprocessing.image import ImageDataGenerator
import numpy as np
import pandas as pd
import os

# Paths
MODEL_PATH = "optimized_image_classifier.h5"  # Path to your trained model
TEST_DIR = "/path/to/test"  # Replace with the correct test directory path
OUTPUT_CSV = "solution.csv"  # Output CSV file

# Image Size & Batch Size
IMG_SIZE = (224, 224)
BATCH_SIZE = 1  # Since test images are processed one by one

# Load the trained model
model = tf.keras.models.load_model(MODEL_PATH)

# Data Preprocessing for Test Images
test_datagen = ImageDataGenerator(rescale=1.0 / 255)
test_generator = test_datagen.flow_from_directory(
    TEST_DIR,
    target_size=IMG_SIZE,
    batch_size=BATCH_SIZE,
    class_mode=None,  # No labels since it's test data
    shuffle=False
)

# Generate Predictions
predictions = model.predict(test_generator)

# Get Image IDs
image_ids = [os.path.basename(path) for path in test_generator.filenames]

# Convert Predictions to DataFrame
df = pd.DataFrame({
    "image_id": image_ids,
    "label": predictions.flatten()  # Flatten to 1D array
})

# Save to CSV
df.to_csv(OUTPUT_CSV, index=False)

print(f"Predictions saved to {OUTPUT_CSV}")
