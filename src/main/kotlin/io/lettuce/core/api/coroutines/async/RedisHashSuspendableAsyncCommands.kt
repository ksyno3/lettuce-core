/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package io.lettuce.core.api.coroutines.async

import kotlinx.coroutines.future.await
import io.lettuce.core.api.coroutines.*
import io.lettuce.core.sentinel.api.coroutines.*
import io.lettuce.core.api.async.*
import io.lettuce.core.sentinel.api.async.*
import io.lettuce.core.ExperimentalLettuceCoroutinesApi
import io.lettuce.core.*
import io.lettuce.core.output.KeyStreamingChannel
import io.lettuce.core.output.KeyValueStreamingChannel
import io.lettuce.core.output.ValueStreamingChannel


/**
 * Coroutine executed commands (based on async commands) for Hashes (Key-Value pairs).
 * 
 * @param <K> Key type.
 * @param <V> Value type.
 * @author Mikhael Sokolov
 * @since 6.0
 * 
 * @generated by io.lettuce.apigenerator.CreateKotlinCoroutinesAsyncImplementation
 **/
@ExperimentalLettuceCoroutinesApi
internal class RedisHashSuspendableAsyncCommands<K, V>(private val ops: RedisHashAsyncCommands<K, V>) : RedisHashSuspendableCommands<K, V> {

    /**
     * Delete one or more hash fields.
     * 
     * @param key the key.
     * @param fields the field type: key.
     * @return Long integer-reply the number of fields that were removed from the hash, not including specified but non existing
     *         fields.
     * 
     **/
    override suspend fun hdel(key: K?, vararg fields: K?): Long? = ops.hdel(key, *fields).await()

    /**
     * Determine if a hash field exists.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the hash contains {@code field}. {@code false} if the hash does not contain {@code field}, or
     *         {@code key} does not exist.
     * 
     **/
    override suspend fun hexists(key: K?, field: K?): Boolean? = ops.hexists(key, field).await()

    /**
     * Get the value of a hash field.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @return V bulk-string-reply the value associated with {@code field}, or {@code null} when {@code field} is not present in
     *         the hash or {@code key} does not exist.
     * 
     **/
    override suspend fun hget(key: K?, field: K?): V? = ops.hget(key, field).await()

    /**
     * Increment the integer value of a hash field by the given number.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @param amount the increment type: long.
     * @return Long integer-reply the value at {@code field} after the increment operation.
     * 
     **/
    override suspend fun hincrby(key: K?, field: K?, amount: Long): Long? = ops.hincrby(key, field, amount).await()

    /**
     * Increment the float value of a hash field by the given amount.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @param amount the increment type: double.
     * @return Double bulk-string-reply the value of {@code field} after the increment.
     * 
     **/
    override suspend fun hincrbyfloat(key: K?, field: K?, amount: Double): Double? = ops.hincrbyfloat(key, field, amount).await()

    /**
     * Get all the fields and values in a hash.
     * 
     * @param key the key.
     * @return Map<K,V> array-reply list of fields and their values stored in the hash, or an empty list when {@code key}
     *         does not exist.
     * 
     **/
    override suspend fun hgetall(key: K?): Map<K, V>? = ops.hgetall(key).await()

    /**
     * Stream over all the fields and values in a hash.
     * 
     * @param channel the channel.
     * @param key the key.
     * @return Long count of the keys.
     * 
     **/
    override suspend fun hgetall(channel: KeyValueStreamingChannel<K, V>?, key: K?): Long? = ops.hgetall(channel, key).await()

    /**
     * Get all the fields in a hash.
     * 
     * @param key the key.
     * @return List<K> array-reply list of fields in the hash, or an empty list when {@code key} does not exist.
     * 
     **/
    override suspend fun hkeys(key: K?): List<K>? = ops.hkeys(key).await()

    /**
     * Stream over all the fields in a hash.
     * 
     * @param channel the channel.
     * @param key the key.
     * @return Long count of the keys.
     * 
     **/
    override suspend fun hkeys(channel: KeyStreamingChannel<K>?, key: K?): Long? = ops.hkeys(channel, key).await()

    /**
     * Get the number of fields in a hash.
     * 
     * @param key the key.
     * @return Long integer-reply number of fields in the hash, or {@code 0} when {@code key} does not exist.
     * 
     **/
    override suspend fun hlen(key: K?): Long? = ops.hlen(key).await()

    /**
     * Get the values of all the given hash fields.
     * 
     * @param key the key.
     * @param fields the field type: key.
     * @return List<V> array-reply list of values associated with the given fields, in the same.
     * 
     **/
    override suspend fun hmget(key: K?, vararg fields: K?): List<KeyValue<K, V>>? = ops.hmget(key, *fields).await()

    /**
     * Stream over the values of all the given hash fields.
     * 
     * @param channel the channel.
     * @param key the key.
     * @param fields the fields.
     * @return Long count of the keys.
     * 
     **/
    override suspend fun hmget(channel: KeyValueStreamingChannel<K, V>?, key: K?, vararg fields: K?): Long? = ops.hmget(channel, key, *fields).await()

    /**
     * Set multiple hash fields to multiple values.
     * 
     * @param key the key.
     * @param map the null.
     * @return String simple-string-reply.
     * 
     **/
    override suspend fun hmset(key: K?, map: Map<K, V>?): String? = ops.hmset(key, map).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param key the key.
     * @return MapScanCursor<K, V> map scan cursor.
     * 
     **/
    override suspend fun hscan(key: K?): MapScanCursor<K, V>? = ops.hscan(key).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param key the key.
     * @param scanArgs scan arguments.
     * @return MapScanCursor<K, V> map scan cursor.
     * 
     **/
    override suspend fun hscan(key: K?, scanArgs: ScanArgs?): MapScanCursor<K, V>? = ops.hscan(key, scanArgs).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param key the key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @param scanArgs scan arguments.
     * @return MapScanCursor<K, V> map scan cursor.
     * 
     **/
    override suspend fun hscan(key: K?, scanCursor: ScanCursor?, scanArgs: ScanArgs?): MapScanCursor<K, V>? = ops.hscan(key, scanCursor, scanArgs).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param key the key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @return MapScanCursor<K, V> map scan cursor.
     * 
     **/
    override suspend fun hscan(key: K?, scanCursor: ScanCursor?): MapScanCursor<K, V>? = ops.hscan(key, scanCursor).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param channel streaming channel that receives a call for every key-value pair.
     * @param key the key.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun hscan(channel: KeyValueStreamingChannel<K, V>?, key: K?): StreamScanCursor? = ops.hscan(channel, key).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param channel streaming channel that receives a call for every key-value pair.
     * @param key the key.
     * @param scanArgs scan arguments.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun hscan(channel: KeyValueStreamingChannel<K, V>?, key: K?, scanArgs: ScanArgs?): StreamScanCursor? = ops.hscan(channel, key, scanArgs).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param channel streaming channel that receives a call for every key-value pair.
     * @param key the key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @param scanArgs scan arguments.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun hscan(channel: KeyValueStreamingChannel<K, V>?, key: K?, scanCursor: ScanCursor?, scanArgs: ScanArgs?): StreamScanCursor? = ops.hscan(channel, key, scanCursor, scanArgs).await()

    /**
     * Incrementally iterate hash fields and associated values.
     * 
     * @param channel streaming channel that receives a call for every key-value pair.
     * @param key the key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun hscan(channel: KeyValueStreamingChannel<K, V>?, key: K?, scanCursor: ScanCursor?): StreamScanCursor? = ops.hscan(channel, key, scanCursor).await()

    /**
     * Set the string value of a hash field.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @param value the value.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if {@code field} is a new field in the hash and {@code value} was set. {@code false} if
     *         {@code field} already exists in the hash and the value was updated.
     * 
     **/
    override suspend fun hset(key: K?, field: K?, value: V?): Boolean? = ops.hset(key, field, value).await()

    /**
     * Set multiple hash fields to multiple values.
     * 
     * @param key the key of the hash.
     * @param map the field/value pairs to update.
     * @return Long integer-reply: the number of fields that were added.
     * @since 5.3
     * 
     **/
    override suspend fun hset(key: K?, map: Map<K, V>?): Long? = ops.hset(key, map).await()

    /**
     * Set the value of a hash field, only if the field does not exist.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @param value the value.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code 1} if {@code field} is a new field in the hash and {@code value} was set. {@code 0} if {@code field}
     *         already exists in the hash and no operation was performed.
     * 
     **/
    override suspend fun hsetnx(key: K?, field: K?, value: V?): Boolean? = ops.hsetnx(key, field, value).await()

    /**
     * Get the string length of the field value in a hash.
     * 
     * @param key the key.
     * @param field the field type: key.
     * @return Long integer-reply the string length of the {@code field} value, or {@code 0} when {@code field} is not present
     *         in the hash or {@code key} does not exist at all.
     * 
     **/
    override suspend fun hstrlen(key: K?, field: K?): Long? = ops.hstrlen(key, field).await()

    /**
     * Get all the values in a hash.
     * 
     * @param key the key.
     * @return List<V> array-reply list of values in the hash, or an empty list when {@code key} does not exist.
     * 
     **/
    override suspend fun hvals(key: K?): List<V>? = ops.hvals(key).await()

    /**
     * Stream over all the values in a hash.
     * 
     * @param channel streaming channel that receives a call for every value.
     * @param key the key.
     * @return Long count of the keys.
     * 
     **/
    override suspend fun hvals(channel: ValueStreamingChannel<V>?, key: K?): Long? = ops.hvals(channel, key).await()

}
