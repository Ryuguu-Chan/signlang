package com.ryuguuchan.outilpourlangagedessignes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClass {
    public static List<Signe> SignList = new List<Signe>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Signe> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Signe signe) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Signe> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Signe> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Signe get(int i) {
            return null;
        }

        @Override
        public Signe set(int i, Signe signe) {
            return null;
        }

        @Override
        public void add(int i, Signe signe) {

        }

        @Override
        public Signe remove(int i) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Signe> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Signe> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Signe> subList(int i, int i1) {
            return null;
        }
    };
}
