package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@Service
@Profile("in-memory")
@Primary
class InMemoryARepository implements ARepository {

    private Map<UUID, A> memory = new HashMap<>();

    @Override
    public List<A> findAll() {
        return null;
    }

    @Override
    public List<A> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<A> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public <S extends A> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends A> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends A> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<A> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public A getOne(UUID uuid) {
        return null;
    }

    @Override
    public A getById(UUID uuid) {
        return null;
    }

    @Override
    public A getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends A> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends A> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<A> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends A> S save(S entity) {
        this.memory.put(entity.getUuid(), entity);
        return entity;
    }

    @Override
    public Optional<A> findById(UUID uuid) {
        System.out.println("******* using in memory you hou hou  ********* ");
        return Optional.ofNullable(this.memory.get(uuid));
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(A entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends A> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends A> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends A> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends A> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends A> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends A, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}