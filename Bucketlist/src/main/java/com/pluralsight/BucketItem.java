package com.pluralsight;

    public class BucketItem {
        private String title;
        private String description;
        private boolean isDone;

        public BucketItem(String title, String description) {
            this.title = title;
            this.description = description;
            this.isDone = false;
        }

        public BucketItem(String part) {
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public boolean isDone() {
            return isDone;
        }

        public void setDone(boolean done) {
            isDone = done;
        }

        @Override
        public String toString() {
            return (isDone ? "[X] " : "[ ] ") + title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

