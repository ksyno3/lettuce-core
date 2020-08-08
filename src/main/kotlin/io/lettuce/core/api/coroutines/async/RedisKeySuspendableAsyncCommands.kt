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
import java.util.Date
import io.lettuce.core.*
import io.lettuce.core.output.KeyStreamingChannel
import io.lettuce.core.output.ValueStreamingChannel


/**
 * Coroutine executed commands (based on async commands) for Keys (Key manipulation/querying).
 * 
 * @param <K> Key type.
 * @param <V> Value type.
 * @author Mikhael Sokolov
 * @since 6.0
 * 
 * @generated by io.lettuce.apigenerator.CreateKotlinCoroutinesAsyncImplementation
 **/
@ExperimentalLettuceCoroutinesApi
internal class RedisKeySuspendableAsyncCommands<K, V>(private val ops: RedisKeyAsyncCommands<K, V>) : RedisKeySuspendableCommands<K, V> {

    /**
     * Delete one or more keys.
     * 
     * @param keys the keys.
     * @return Long integer-reply The number of keys that were removed.
     * 
     **/
    override suspend fun del(vararg keys: K?): Long? = ops.del(*keys).await()

    /**
     * Unlink one or more keys (non blocking DEL).
     * 
     * @param keys the keys.
     * @return Long integer-reply The number of keys that were removed.
     * 
     **/
    override suspend fun unlink(vararg keys: K?): Long? = ops.unlink(*keys).await()

    /**
     * Return a serialized version of the value stored at the specified key.
     * 
     * @param key the key.
     * @return byte[] bulk-string-reply the serialized value.
     * 
     **/
    override suspend fun dump(key: K?): ByteArray? = ops.dump(key).await()

    /**
     * Determine how many keys exist.
     * 
     * @param keys the keys.
     * @return Long integer-reply specifically: Number of existing keys.
     * 
     **/
    override suspend fun exists(vararg keys: K?): Long? = ops.exists(*keys).await()

    /**
     * Set a key's time to live in seconds.
     * 
     * @param key the key.
     * @param seconds the seconds type: long.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set.
     * 
     **/
    override suspend fun expire(key: K?, seconds: Long): Boolean? = ops.expire(key, seconds).await()

    /**
     * Set the expiration for a key as a UNIX timestamp.
     * 
     * @param key the key.
     * @param timestamp the timestamp type: posix time.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set
     *         (see: {@code EXPIRE}).
     * 
     **/
    override suspend fun expireat(key: K?, timestamp: Date?): Boolean? = ops.expireat(key, timestamp).await()

    /**
     * Set the expiration for a key as a UNIX timestamp.
     * 
     * @param key the key.
     * @param timestamp the timestamp type: posix time.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set
     *         (see: {@code EXPIRE}).
     * 
     **/
    override suspend fun expireat(key: K?, timestamp: Long): Boolean? = ops.expireat(key, timestamp).await()

    /**
     * Find all keys matching the given pattern.
     * 
     * @param pattern the pattern type: patternkey (pattern).
     * @return List<K> array-reply list of keys matching {@code pattern}.
     * 
     **/
    override suspend fun keys(pattern: K?): List<K>? = ops.keys(pattern).await()

    /**
     * Find all keys matching the given pattern.
     * 
     * @param channel the channel.
     * @param pattern the pattern.
     * @return Long array-reply list of keys matching {@code pattern}.
     * 
     **/
    override suspend fun keys(channel: KeyStreamingChannel<K>?, pattern: K?): Long? = ops.keys(channel, pattern).await()

    /**
     * Atomically transfer a key from a Redis instance to another one.
     * 
     * @param host the host.
     * @param port the port.
     * @param key the key.
     * @param db the database.
     * @param timeout the timeout in milliseconds.
     * @return String simple-string-reply The command returns OK on success.
     * 
     **/
    override suspend fun migrate(host: String?, port: Int, key: K?, db: Int, timeout: Long): String? = ops.migrate(host, port, key, db, timeout).await()

    /**
     * Atomically transfer one or more keys from a Redis instance to another one.
     * 
     * @param host the host.
     * @param port the port.
     * @param db the database.
     * @param timeout the timeout in milliseconds.
     * @param migrateArgs migrate args that allow to configure further options.
     * @return String simple-string-reply The command returns OK on success.
     * 
     **/
    override suspend fun migrate(host: String?, port: Int, db: Int, timeout: Long, migrateArgs: MigrateArgs<K>?): String? = ops.migrate(host, port, db, timeout, migrateArgs).await()

    /**
     * Move a key to another database.
     * 
     * @param key the key.
     * @param db the db type: long.
     * @return Boolean integer-reply specifically:.
     * 
     **/
    override suspend fun move(key: K?, db: Int): Boolean? = ops.move(key, db).await()

    /**
     * returns the kind of internal representation used in order to store the value associated with a key.
     * 
     * @param key the key.
     * @return String.
     * 
     **/
    override suspend fun objectEncoding(key: K?): String? = ops.objectEncoding(key).await()

    /**
     * returns the number of seconds since the object stored at the specified key is idle (not requested by read or write
     * operations).
     * 
     * @param key the key.
     * @return number of seconds since the object stored at the specified key is idle.
     * 
     **/
    override suspend fun objectIdletime(key: K?): Long? = ops.objectIdletime(key).await()

    /**
     * returns the number of references of the value associated with the specified key.
     * 
     * @param key the key.
     * @return Long.
     * 
     **/
    override suspend fun objectRefcount(key: K?): Long? = ops.objectRefcount(key).await()

    /**
     * Remove the expiration from a key.
     * 
     * @param key the key.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was removed. {@code false} if {@code key} does not exist or does not have an
     *         associated timeout.
     * 
     **/
    override suspend fun persist(key: K?): Boolean? = ops.persist(key).await()

    /**
     * Set a key's time to live in milliseconds.
     * 
     * @param key the key.
     * @param milliseconds the milliseconds type: long.
     * @return integer-reply, specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set.
     * 
     **/
    override suspend fun pexpire(key: K?, milliseconds: Long): Boolean? = ops.pexpire(key, milliseconds).await()

    /**
     * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
     * 
     * @param key the key.
     * @param timestamp the milliseconds-timestamp type: posix time.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set
     *         (see: {@code EXPIRE}).
     * 
     **/
    override suspend fun pexpireat(key: K?, timestamp: Date?): Boolean? = ops.pexpireat(key, timestamp).await()

    /**
     * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
     * 
     * @param key the key.
     * @param timestamp the milliseconds-timestamp type: posix time.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if the timeout was set. {@code false} if {@code key} does not exist or the timeout could not be set
     *         (see: {@code EXPIRE}).
     * 
     **/
    override suspend fun pexpireat(key: K?, timestamp: Long): Boolean? = ops.pexpireat(key, timestamp).await()

    /**
     * Get the time to live for a key in milliseconds.
     * 
     * @param key the key.
     * @return Long integer-reply TTL in milliseconds, or a negative value in order to signal an error (see the description
     *         above).
     * 
     **/
    override suspend fun pttl(key: K?): Long? = ops.pttl(key).await()

    /**
     * Return a random key from the keyspace.
     * 
     * @return K bulk-string-reply the random key, or {@code null} when the database is empty.
     * 
     **/
    override suspend fun randomkey(): K? = ops.randomkey().await()

    /**
     * Rename a key.
     * 
     * @param key the key.
     * @param newKey the newkey type: key.
     * @return String simple-string-reply.
     * 
     **/
    override suspend fun rename(key: K?, newKey: K?): String? = ops.rename(key, newKey).await()

    /**
     * Rename a key, only if the new key does not exist.
     * 
     * @param key the key.
     * @param newKey the newkey type: key.
     * @return Boolean integer-reply specifically:
     * 
     *         {@code true} if {@code key} was renamed to {@code newkey}. {@code false} if {@code newkey} already exists.
     * 
     **/
    override suspend fun renamenx(key: K?, newKey: K?): Boolean? = ops.renamenx(key, newKey).await()

    /**
     * Create a key using the provided serialized value, previously obtained using DUMP.
     * 
     * @param key the key.
     * @param ttl the ttl type: long.
     * @param value the serialized-value type: string.
     * @return String simple-string-reply The command returns OK on success.
     * 
     **/
    override suspend fun restore(key: K?, ttl: Long, value: ByteArray?): String? = ops.restore(key, ttl, value).await()

    /**
     * Create a key using the provided serialized value, previously obtained using DUMP.
     * 
     * @param key the key.
     * @param value the serialized-value type: string.
     * @param args the {@link RestoreArgs}, must not be {@code null}.
     * @return String simple-string-reply The command returns OK on success.
     * @since 5.1
     * 
     **/
    override suspend fun restore(key: K?, value: ByteArray?, args: RestoreArgs?): String? = ops.restore(key, value, args).await()

    /**
     * Sort the elements in a list, set or sorted set.
     * 
     * @param key the key.
     * @return List<V> array-reply list of sorted elements.
     * 
     **/
    override suspend fun sort(key: K?): List<V>? = ops.sort(key).await()

    /**
     * Sort the elements in a list, set or sorted set.
     * 
     * @param channel streaming channel that receives a call for every value.
     * @param key the key.
     * @return Long number of values.
     * 
     **/
    override suspend fun sort(channel: ValueStreamingChannel<V>?, key: K?): Long? = ops.sort(channel, key).await()

    /**
     * Sort the elements in a list, set or sorted set.
     * 
     * @param key the key.
     * @param sortArgs sort arguments.
     * @return List<V> array-reply list of sorted elements.
     * 
     **/
    override suspend fun sort(key: K?, sortArgs: SortArgs?): List<V>? = ops.sort(key, sortArgs).await()

    /**
     * Sort the elements in a list, set or sorted set.
     * 
     * @param channel streaming channel that receives a call for every value.
     * @param key the key.
     * @param sortArgs sort arguments.
     * @return Long number of values.
     * 
     **/
    override suspend fun sort(channel: ValueStreamingChannel<V>?, key: K?, sortArgs: SortArgs?): Long? = ops.sort(channel, key, sortArgs).await()

    /**
     * Sort the elements in a list, set or sorted set.
     * 
     * @param key the key.
     * @param sortArgs sort arguments.
     * @param destination the destination key to store sort results.
     * @return Long number of values.
     * 
     **/
    override suspend fun sortStore(key: K?, sortArgs: SortArgs?, destination: K?): Long? = ops.sortStore(key, sortArgs, destination).await()

    /**
     * Touch one or more keys. Touch sets the last accessed time for a key. Non-exsitent keys wont get created.
     * 
     * @param keys the keys.
     * @return Long integer-reply the number of found keys.
     * 
     **/
    override suspend fun touch(vararg keys: K?): Long? = ops.touch(*keys).await()

    /**
     * Get the time to live for a key.
     * 
     * @param key the key.
     * @return Long integer-reply TTL in seconds, or a negative value in order to signal an error (see the description above).
     * 
     **/
    override suspend fun ttl(key: K?): Long? = ops.ttl(key).await()

    /**
     * Determine the type stored at key.
     * 
     * @param key the key.
     * @return String simple-string-reply type of {@code key}, or {@code none} when {@code key} does not exist.
     * 
     **/
    override suspend fun type(key: K?): String? = ops.type(key).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @return KeyScanCursor<K> scan cursor.
     * 
     **/
    override suspend fun scan(): KeyScanCursor<K>? = ops.scan().await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param scanArgs scan arguments.
     * @return KeyScanCursor<K> scan cursor.
     * 
     **/
    override suspend fun scan(scanArgs: ScanArgs?): KeyScanCursor<K>? = ops.scan(scanArgs).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @param scanArgs scan arguments.
     * @return KeyScanCursor<K> scan cursor.
     * 
     **/
    override suspend fun scan(scanCursor: ScanCursor?, scanArgs: ScanArgs?): KeyScanCursor<K>? = ops.scan(scanCursor, scanArgs).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @return KeyScanCursor<K> scan cursor.
     * 
     **/
    override suspend fun scan(scanCursor: ScanCursor?): KeyScanCursor<K>? = ops.scan(scanCursor).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param channel streaming channel that receives a call for every key.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun scan(channel: KeyStreamingChannel<K>?): StreamScanCursor? = ops.scan(channel).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param channel streaming channel that receives a call for every key.
     * @param scanArgs scan arguments.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun scan(channel: KeyStreamingChannel<K>?, scanArgs: ScanArgs?): StreamScanCursor? = ops.scan(channel, scanArgs).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param channel streaming channel that receives a call for every key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @param scanArgs scan arguments.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun scan(channel: KeyStreamingChannel<K>?, scanCursor: ScanCursor?, scanArgs: ScanArgs?): StreamScanCursor? = ops.scan(channel, scanCursor, scanArgs).await()

    /**
     * Incrementally iterate the keys space.
     * 
     * @param channel streaming channel that receives a call for every key.
     * @param scanCursor cursor to resume from a previous scan, must not be {@code null}.
     * @return StreamScanCursor scan cursor.
     * 
     **/
    override suspend fun scan(channel: KeyStreamingChannel<K>?, scanCursor: ScanCursor?): StreamScanCursor? = ops.scan(channel, scanCursor).await()

}
