"use client";

import { useState } from "react";

interface UserSearchProps {
    onSearch: (name: string) => void;
}

export default function UserSearch({ onSearch }: UserSearchProps) {
    const [name, setName] = useState("");

    function handleSearch() {
        onSearch(name);
    }

    return (
        <div className="flex gap-2 mb-6">
            <input
                type="text"
                placeholder="Pesquisar usuário..."
                value={name}
                onChange={(e) => setName(e.target.value)}
                className="border rounded-lg px-4 py-2"
            />

            <button
                onClick={handleSearch}
                className="border rounded-lg px-4 py-2"
            >
                Pesquisar
            </button>
        </div>
    );
}