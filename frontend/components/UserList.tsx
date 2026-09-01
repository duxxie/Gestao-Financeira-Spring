"use client";

import { useState } from "react";
import { User } from "@/types/types";
import UserCard from "./UserCard";
import UserSearch from "./UserSearch";
import { getUsers, searchUsersByName } from "@/services/userService";

interface UserListProps {
    initialUsers: User[];
}

export default function UserList({ initialUsers }: UserListProps) {
    const [users, setUsers] = useState<User[]>(initialUsers);

    async function handleSearch(name: string) {
        if (name.trim() === "") {
            const users = await getUsers();
            setUsers(users);
            return;
        }

        const users = await searchUsersByName(name);
        setUsers(users);
    }

    return (
        <>
            <UserSearch onSearch={handleSearch} />

            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
                {users.map((user) => (
                    <UserCard
                        key={user.id}
                        user={user}
                    />
                ))}
            </div>
        </>
    );
}